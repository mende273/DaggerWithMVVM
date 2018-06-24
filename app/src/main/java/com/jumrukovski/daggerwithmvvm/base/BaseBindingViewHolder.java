package com.jumrukovski.daggerwithmvvm.base;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BaseBindingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public final ViewDataBinding binding;
    private final ClickListener clickListener;

    public interface ClickListener {
        void onViewClick(int position, View[] sharedViews);
    }

    public View[] sharedViews() {
        return new View[]{};
    }

    public BaseBindingViewHolder(ViewDataBinding binding, @NonNull ClickListener clickListener) {
        super(binding.getRoot());
        binding.getRoot().setOnClickListener(this);
        this.binding = binding;
        this.clickListener = clickListener;
    }

    @Override
    public void onClick(View v) {
        clickListener.onViewClick(getAdapterPosition(),sharedViews());
    }

}