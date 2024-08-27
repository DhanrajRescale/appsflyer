package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import h9.b;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "Landroid/widget/ScrollView;", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "a", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootView", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "setRootView", "(Lcom/afollestad/materialdialogs/internal/main/DialogLayout;)V", "rootView", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogScrollView extends ScrollView {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public DialogLayout rootView;

    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        if (getChildCount() != 0 && getMeasuredHeight() != 0) {
            View childAt = getChildAt(0);
            Intrinsics.b(childAt, "getChildAt(0)");
            if (childAt.getMeasuredHeight() > getHeight()) {
                View view = getChildAt(getChildCount() - 1);
                Intrinsics.b(view, "view");
                int bottom = view.getBottom() - (getScrollY() + getMeasuredHeight());
                DialogLayout dialogLayout = this.rootView;
                if (dialogLayout != null) {
                    if (getScrollY() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bottom > 0) {
                        z11 = true;
                    }
                    DialogTitleLayout dialogTitleLayout = dialogLayout.titleLayout;
                    if (dialogTitleLayout != null) {
                        dialogTitleLayout.setDrawDivider(z10);
                        DialogActionButtonLayout dialogActionButtonLayout = dialogLayout.buttonsLayout;
                        if (dialogActionButtonLayout != null) {
                            dialogActionButtonLayout.setDrawDivider(z11);
                            return;
                        }
                        return;
                    }
                    Intrinsics.k("titleLayout");
                    throw null;
                }
                return;
            }
        }
        DialogLayout dialogLayout2 = this.rootView;
        if (dialogLayout2 != null) {
            DialogTitleLayout dialogTitleLayout2 = dialogLayout2.titleLayout;
            if (dialogTitleLayout2 != null) {
                dialogTitleLayout2.setDrawDivider(false);
                DialogActionButtonLayout dialogActionButtonLayout2 = dialogLayout2.buttonsLayout;
                if (dialogActionButtonLayout2 != null) {
                    dialogActionButtonLayout2.setDrawDivider(false);
                    return;
                }
                return;
            }
            Intrinsics.k("titleLayout");
            throw null;
        }
    }

    @Override // android.view.View
    public final DialogLayout getRootView() {
        return this.rootView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = b.f18063a;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            bVar.invoke(this);
        } else {
            getViewTreeObserver().addOnGlobalLayoutListener(new i9.b(this, bVar));
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        a();
    }

    public final void setRootView(DialogLayout dialogLayout) {
        this.rootView = dialogLayout;
    }
}
