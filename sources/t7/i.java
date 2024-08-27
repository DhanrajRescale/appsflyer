package t7;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f35482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35483b;

    public i(View view, ArrayList arrayList) {
        this.f35482a = view;
        this.f35483b = arrayList;
    }

    @Override // t7.o
    public final void a() {
    }

    @Override // t7.o
    public final void b() {
    }

    @Override // t7.o
    public final void c(p pVar) {
        pVar.w(this);
        this.f35482a.setVisibility(8);
        ArrayList arrayList = this.f35483b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // t7.o
    public final void d() {
    }

    @Override // t7.o
    public final void e(p pVar) {
        pVar.w(this);
        pVar.a(this);
    }
}
