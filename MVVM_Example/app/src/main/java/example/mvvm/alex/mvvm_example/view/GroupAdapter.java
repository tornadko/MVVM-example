package example.mvvm.alex.mvvm_example.view;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import example.mvvm.alex.mvvm_example.R;
import example.mvvm.alex.mvvm_example.databinding.ItemGroupBinding;
import example.mvvm.alex.mvvm_example.model.Group;
import example.mvvm.alex.mvvm_example.viewmodel.GroupViewModel;

/**
 * Created by Alex on 28.04.2016.
 */
public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupViewHolder> {
    private List<Group> items;

    @Override
    public GroupViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemGroupBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_group,
                parent,
                false);
        return new GroupViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(GroupViewHolder holder, int position) {
        holder.bindGroup(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(List<Group> items) {
        this.items = items;
    }

    public static class GroupViewHolder extends RecyclerView.ViewHolder{

        private final ItemGroupBinding binding;

        public GroupViewHolder(ItemGroupBinding binding) {
            super(binding.tvName);
            this.binding = binding;
        }

        void bindGroup(Group group){
            if(binding.getViewModel() == null){
                binding.setViewModel(new GroupViewModel(group));
            } else {
                binding.getViewModel().setGroup(group);
            }
        }


    }
}
