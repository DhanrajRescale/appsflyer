package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import h.c;
import l.e0;
import l.n;
import l.o;
import l.q;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements n, e0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f903b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public o f904a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c cVar = new c(context, context.obtainStyledAttributes(attributeSet, f903b, R.attr.listViewStyle, 0));
        if (cVar.H(0)) {
            setBackgroundDrawable(cVar.v(0));
        }
        if (cVar.H(1)) {
            setDivider(cVar.v(1));
        }
        cVar.R();
    }

    @Override // l.n
    public final boolean a(q qVar) {
        return this.f904a.q(qVar, null, 0);
    }

    @Override // l.e0
    public final void d(o oVar) {
        this.f904a = oVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((q) getAdapter().getItem(i10));
    }
}
