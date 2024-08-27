package x7;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f40073a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f40074b;

    public abstract void a(int i10, Object obj);

    public abstract void b();

    public abstract int c();

    public abstract g0 d(int i10, ViewGroup viewGroup);

    public abstract boolean e(View view, Object obj);

    public abstract void f(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable g();

    public abstract void h(Object obj);

    public abstract void i(ViewGroup viewGroup);
}
