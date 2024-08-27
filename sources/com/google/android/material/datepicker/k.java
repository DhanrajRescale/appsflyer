package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import k7.n1;

/* loaded from: classes2.dex */
public final class k extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f11284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f11285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11286c;

    public k(l lVar, v vVar, MaterialButton materialButton) {
        this.f11286c = lVar;
        this.f11284a = vVar;
        this.f11285b = materialButton;
    }

    @Override // k7.n1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f11285b.getText());
        }
    }

    @Override // k7.n1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int R0;
        l lVar = this.f11286c;
        if (i10 < 0) {
            R0 = ((LinearLayoutManager) lVar.f11294h.getLayoutManager()).Q0();
        } else {
            R0 = ((LinearLayoutManager) lVar.f11294h.getLayoutManager()).R0();
        }
        v vVar = this.f11284a;
        Calendar b10 = y.b(vVar.f11343d.f11266a.f11327a);
        b10.add(2, R0);
        lVar.f11290d = new r(b10);
        Calendar b11 = y.b(vVar.f11343d.f11266a.f11327a);
        b11.add(2, R0);
        b11.set(5, 1);
        Calendar b12 = y.b(b11);
        b12.get(2);
        b12.get(1);
        b12.getMaximum(7);
        b12.getActualMaximum(5);
        b12.getTimeInMillis();
        this.f11285b.setText(y.a("yMMMM", Locale.getDefault()).format(new Date(b12.getTimeInMillis())));
    }
}
