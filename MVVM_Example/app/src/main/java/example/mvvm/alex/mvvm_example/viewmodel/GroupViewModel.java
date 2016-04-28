package example.mvvm.alex.mvvm_example.viewmodel;

import android.databinding.BaseObservable;

import example.mvvm.alex.mvvm_example.model.Group;

/**
 * Created by Alex on 28.04.2016.
 */
public class GroupViewModel extends BaseObservable {
    private Group group;

    public GroupViewModel(Group group) {
        this.group = group;
    }

    public String getName() {
        return group.getName();
    }

    public void setGroup(Group group) {
        this.group = group;
        notifyChange();
    }
}
