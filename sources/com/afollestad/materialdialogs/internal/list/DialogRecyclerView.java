package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import g9.a;
import i9.b;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import k7.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogRecyclerView extends RecyclerView {

    /* renamed from: e1, reason: collision with root package name */
    public final y f8328e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.e(context, "context");
        this.f8328e1 = new y(this, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = a.f17173a;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            aVar.invoke(this);
        } else {
            getViewTreeObserver().addOnGlobalLayoutListener(new b(this, aVar));
        }
        j(this.f8328e1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            arrayList.remove(this.f8328e1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (getChildCount() != 0) {
            getMeasuredHeight();
        }
    }
}
