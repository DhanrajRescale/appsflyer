package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1855e;

    public w1(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1851a = i10;
        this.f1852b = arrayList;
        this.f1853c = arrayList2;
        this.f1854d = arrayList3;
        this.f1855e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f1851a; i10++) {
            View view = (View) this.f1852b.get(i10);
            String str = (String) this.f1853c.get(i10);
            WeakHashMap weakHashMap = d4.n1.f13788a;
            d4.b1.v(view, str);
            d4.b1.v((View) this.f1854d.get(i10), (String) this.f1855e.get(i10));
        }
    }
}
