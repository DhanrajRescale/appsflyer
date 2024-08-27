package me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import g7.d3;
import k7.b1;
import k7.v0;
import k7.y;
import zu.a;
import zu.c;

/* loaded from: classes2.dex */
public class CircleIndicator2 extends c {

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f27726k;

    /* renamed from: l, reason: collision with root package name */
    public v0 f27727l;

    /* renamed from: m, reason: collision with root package name */
    public final y f27728m;

    /* renamed from: n, reason: collision with root package name */
    public final d3 f27729n;

    public CircleIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = 4;
        this.f27728m = new y(this, i10);
        this.f27729n = new d3(this, i10);
    }

    public b1 getAdapterDataObserver() {
        return this.f27729n;
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(a aVar) {
    }
}
