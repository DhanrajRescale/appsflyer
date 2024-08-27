package m;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public final class m0 implements ListAdapter, SpinnerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public SpinnerAdapter f25622a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f25623b;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f25623b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f25622a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f25622a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        SpinnerAdapter spinnerAdapter = this.f25622a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        SpinnerAdapter spinnerAdapter = this.f25622a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i10);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i10) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        return getDropDownView(i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f25622a;
        if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i10) {
        ListAdapter listAdapter = this.f25623b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i10);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f25622a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f25622a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
