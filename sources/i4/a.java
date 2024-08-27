package i4;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import d2.d4;
import jr.h;
import m.f2;
import m.j3;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19334a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19335b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f19336c;

    /* renamed from: d, reason: collision with root package name */
    public int f19337d;

    /* renamed from: e, reason: collision with root package name */
    public d4 f19338e;

    /* renamed from: f, reason: collision with root package name */
    public f2 f19339f;

    /* renamed from: g, reason: collision with root package name */
    public c f19340g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f19336c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                d4 d4Var = this.f19338e;
                if (d4Var != null) {
                    cursor2.unregisterContentObserver(d4Var);
                }
                f2 f2Var = this.f19339f;
                if (f2Var != null) {
                    cursor2.unregisterDataSetObserver(f2Var);
                }
            }
            this.f19336c = cursor;
            if (cursor != null) {
                d4 d4Var2 = this.f19338e;
                if (d4Var2 != null) {
                    cursor.registerContentObserver(d4Var2);
                }
                f2 f2Var2 = this.f19339f;
                if (f2Var2 != null) {
                    cursor.registerDataSetObserver(f2Var2);
                }
                this.f19337d = cursor.getColumnIndexOrThrow("_id");
                this.f19334a = true;
                notifyDataSetChanged();
            } else {
                this.f19337d = -1;
                this.f19334a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f19334a && (cursor = this.f19336c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f19334a) {
            this.f19336c.moveToPosition(i10);
            if (view == null) {
                j3 j3Var = (j3) this;
                view = j3Var.f25598j.inflate(j3Var.f25597i, viewGroup, false);
            }
            a(view, this.f19336c);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i4.c, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f19340g == null) {
            ?? filter = new Filter();
            filter.f19341a = this;
            this.f19340g = filter;
        }
        return this.f19340g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f19334a && (cursor = this.f19336c) != null) {
            cursor.moveToPosition(i10);
            return this.f19336c;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f19334a || (cursor = this.f19336c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f19336c.getLong(this.f19337d);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f19334a) {
            if (this.f19336c.moveToPosition(i10)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f19336c);
                return view;
            }
            throw new IllegalStateException(h.n("couldn't move cursor to position ", i10));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
