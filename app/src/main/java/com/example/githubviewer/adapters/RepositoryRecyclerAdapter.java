package com.example.githubviewer.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.githubviewer.R;
import com.example.githubviewer.bean.Repository;
import com.squareup.picasso.Picasso;

import java.net.URISyntaxException;
import java.util.List;

public class RepositoryRecyclerAdapter extends RecyclerView.Adapter<RepositoryRecyclerAdapter.ViewHolder> {

    private final Context Context;
    private List<Repository> repositories;
    private final LayoutInflater layoutInflater;

    public RepositoryRecyclerAdapter(Context Context, List<Repository> repositories) {
        this.Context = Context;
        this.repositories = repositories;
        layoutInflater = LayoutInflater.from(Context);
    }

    //creates the viewHolder instances
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = layoutInflater.inflate(R.layout.item_repo_list, viewGroup, false);
        return new ViewHolder(itemView);
    }

    //associates data with views
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Repository repository = repositories.get(i);
        viewHolder.repoName.setText(repository.getName());
        viewHolder.repoOwner.setText(repository.getRepositoryOwner().getLogin());
        viewHolder.repoDescription.setText(repository.getDescription());
        viewHolder.repoStars.setText(String.valueOf(repository.getStargazers_count()));
//        viewHolder.repoOwnerImage.setImageURI(repository.getRepositoryOwner().getAvatarUri());
        Picasso.get().load(repository.getRepositoryOwner().getAvatar()).resize(50,50).into(viewHolder.repoOwnerImage);
        viewHolder.currentPosition = i;
    }


    // gives back the number of items we have
    @Override
    public int getItemCount() {
        return repositories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView repoName;
        public final TextView repoDescription;
        public final TextView repoOwner;
        public final TextView repoStars;
        public final ImageView repoOwnerImage;
        public int currentPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            repoName = itemView.findViewById(R.id.repo_name);
            repoDescription = itemView.findViewById(R.id.repo_description);
            repoOwner = itemView.findViewById(R.id.repo_owner);
            repoStars = itemView.findViewById(R.id.repo_stars);
            repoOwnerImage = itemView.findViewById(R.id.repo_owner_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Context, "Hello!", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
