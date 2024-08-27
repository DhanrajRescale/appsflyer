package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import c2.p0;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import in.juspay.hyper.constants.LogCategory;
import iu.a0;
import iu.b;
import iu.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ou.g;
import ut.h;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "Landroid/widget/FrameLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "a", "Lut/g;", "getFrameHorizontalMargin", "()I", "frameHorizontalMargin", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "b", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "getScrollView", "()Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "setScrollView", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "scrollView", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "c", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "getRecyclerView", "()Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "setRecyclerView", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "recyclerView", "Landroid/view/View;", "d", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "customView", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "rootLayout", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogContentLayout extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f8348e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ut.g frameHorizontalMargin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public DialogScrollView scrollView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public DialogRecyclerView recyclerView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public View customView;

    static {
        u uVar = new u(b.f20537a, a0.a(DialogContentLayout.class).getF20549a(), "frameHorizontalMargin", "getFrameHorizontalMargin()I", 0);
        a0.f20536a.getClass();
        f8348e = new g[]{uVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.e(context, "context");
        this.frameHorizontalMargin = h.a(new p0(this, 14));
    }

    private final int getFrameHorizontalMargin() {
        ut.g gVar = this.frameHorizontalMargin;
        g gVar2 = f8348e[0];
        return ((Number) gVar.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new ClassCastException("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public final View getCustomView() {
        return this.customView;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final DialogScrollView getScrollView() {
        return this.scrollView;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        while (i14 < childCount) {
            View currentChild = getChildAt(i14);
            Intrinsics.b(currentChild, "currentChild");
            int measuredHeight = currentChild.getMeasuredHeight() + i15;
            Intrinsics.a(currentChild, this.customView);
            currentChild.layout(0, i15, getMeasuredWidth(), measuredHeight);
            i14++;
            i15 = measuredHeight;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        DialogScrollView dialogScrollView = this.scrollView;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.scrollView;
        if (dialogScrollView2 != null) {
            i12 = dialogScrollView2.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        int i13 = size2 - i12;
        int childCount = this.scrollView != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, i12);
            return;
        }
        int i14 = i13 / childCount;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View currentChild = getChildAt(i15);
            Intrinsics.b(currentChild, "currentChild");
            int id2 = currentChild.getId();
            DialogScrollView dialogScrollView3 = this.scrollView;
            if (dialogScrollView3 == null || id2 != dialogScrollView3.getId()) {
                Intrinsics.a(currentChild, this.customView);
                currentChild.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                i12 = currentChild.getMeasuredHeight() + i12;
            }
        }
        setMeasuredDimension(size, i12);
    }

    public final void setCustomView(View view) {
        this.customView = view;
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.recyclerView = dialogRecyclerView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.scrollView = dialogScrollView;
    }
}
