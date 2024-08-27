package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l.e0;
import l.o;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements e0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // l.e0
    public final void d(o oVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
