package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import bl.j;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e9.a;
import e9.b;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import s0.g;
import yk.o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010ER\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006F"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "Landroid/widget/FrameLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "a", "I", "getMaxHeight", "()I", "setMaxHeight", "(I)V", "maxHeight", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, "b", "Z", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "debugMode", "d", "getFrameMarginVertical$com_afollestad_material_dialogs_core", "frameMarginVertical", "e", "getFrameMarginVerticalLess$com_afollestad_material_dialogs_core", "frameMarginVerticalLess", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "f", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "getTitleLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "setTitleLayout", "(Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;)V", "titleLayout", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "g", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "getContentLayout", "()Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "setContentLayout", "(Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;)V", "contentLayout", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "h", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "getButtonsLayout", "()Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "setButtonsLayout", "(Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;)V", "buttonsLayout", "Le9/a;", "i", "Le9/a;", "getLayoutMode", "()Le9/a;", "setLayoutMode", "(Le9/a;)V", "layoutMode", "Le9/b;", "dialog", "Le9/b;", "getDialog", "()Le9/b;", "setDialog", "(Le9/b;)V", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int maxHeight;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean debugMode;

    /* renamed from: c, reason: collision with root package name */
    public Paint f8331c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int frameMarginVertical;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int frameMarginVerticalLess;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public DialogTitleLayout titleLayout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public DialogContentLayout contentLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public DialogActionButtonLayout buttonsLayout;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public a layoutMode;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8338j;

    /* renamed from: k, reason: collision with root package name */
    public int f8339k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.e(context, "context");
        Context context2 = getContext();
        Intrinsics.b(context2, "context");
        this.frameMarginVertical = context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
        Context context3 = getContext();
        Intrinsics.b(context3, "context");
        this.frameMarginVerticalLess = context3.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical_less);
        this.layoutMode = a.f15098a;
        this.f8338j = true;
        this.f8339k = -1;
    }

    public static void a(DialogLayout dialogLayout, Canvas canvas, int i10, float f10) {
        canvas.drawLine(g.f34069a, f10, dialogLayout.getMeasuredWidth(), f10, dialogLayout.b(i10, 1.0f));
    }

    public static void c(DialogLayout dialogLayout, Canvas canvas, int i10, float f10) {
        canvas.drawLine(f10, g.f34069a, f10, dialogLayout.getMeasuredHeight(), dialogLayout.b(i10, 1.0f));
    }

    public final Paint b(int i10, float f10) {
        if (this.f8331c == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(o.K(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f8331c = paint;
        }
        Paint paint2 = this.f8331c;
        if (paint2 == null) {
            Intrinsics.j();
        }
        paint2.setColor(i10);
        setAlpha(f10);
        return paint2;
    }

    public final DialogActionButtonLayout getButtonsLayout() {
        return this.buttonsLayout;
    }

    @NotNull
    public final DialogContentLayout getContentLayout() {
        DialogContentLayout dialogContentLayout = this.contentLayout;
        if (dialogContentLayout != null) {
            return dialogContentLayout;
        }
        Intrinsics.k("contentLayout");
        throw null;
    }

    public final boolean getDebugMode() {
        return this.debugMode;
    }

    @NotNull
    public final b getDialog() {
        Intrinsics.k("dialog");
        throw null;
    }

    /* renamed from: getFrameMarginVertical$com_afollestad_material_dialogs_core, reason: from getter */
    public final int getFrameMarginVertical() {
        return this.frameMarginVertical;
    }

    /* renamed from: getFrameMarginVerticalLess$com_afollestad_material_dialogs_core, reason: from getter */
    public final int getFrameMarginVerticalLess() {
        return this.frameMarginVerticalLess;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final a getLayoutMode() {
        return this.layoutMode;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    @NotNull
    public final DialogTitleLayout getTitleLayout() {
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout != null) {
            return dialogTitleLayout;
        }
        Intrinsics.k("titleLayout");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Point point = new Point();
            ((WindowManager) systemService).getDefaultDisplay().getSize(point);
            this.f8339k = Integer.valueOf(point.y).intValue();
            return;
        }
        throw new ClassCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth;
        Intrinsics.e(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.debugMode) {
            return;
        }
        c(this, canvas, -16776961, o.K(this, 24));
        a(this, canvas, -16776961, o.K(this, 24));
        c(this, canvas, -16776961, getMeasuredWidth() - o.K(this, 24));
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout != null) {
            if (j.K(dialogTitleLayout)) {
                if (this.titleLayout != null) {
                    a(this, canvas, -65536, r1.getBottom());
                } else {
                    Intrinsics.k("titleLayout");
                    throw null;
                }
            }
            DialogContentLayout dialogContentLayout = this.contentLayout;
            if (dialogContentLayout != null) {
                if (j.K(dialogContentLayout)) {
                    if (this.contentLayout != null) {
                        a(this, canvas, -256, r1.getTop());
                    } else {
                        Intrinsics.k("contentLayout");
                        throw null;
                    }
                }
                if (!o.W(this.buttonsLayout)) {
                    return;
                }
                if (j.I(this)) {
                    measuredWidth = o.K(this, 8);
                } else {
                    measuredWidth = getMeasuredWidth() - o.K(this, 8);
                }
                c(this, canvas, -16711681, measuredWidth);
                DialogActionButtonLayout dialogActionButtonLayout = this.buttonsLayout;
                if (dialogActionButtonLayout != null && dialogActionButtonLayout.getStackButtons()) {
                    if (this.buttonsLayout == null) {
                        Intrinsics.j();
                    }
                    float K = o.K(this, 8) + r1.getTop();
                    DialogActionButtonLayout dialogActionButtonLayout2 = this.buttonsLayout;
                    if (dialogActionButtonLayout2 == null) {
                        Intrinsics.j();
                    }
                    for (DialogActionButton dialogActionButton : dialogActionButtonLayout2.getVisibleButtons()) {
                        float K2 = o.K(this, 36) + K;
                        canvas.drawRect(dialogActionButton.getLeft(), K, getMeasuredWidth() - o.K(this, 8), K2, b(-16711681, 0.4f));
                        K = o.K(this, 16) + K2;
                    }
                    if (this.buttonsLayout == null) {
                        Intrinsics.j();
                    }
                    a(this, canvas, -16776961, r1.getTop());
                    if (this.buttonsLayout == null) {
                        Intrinsics.j();
                    }
                    float K3 = o.K(this, 8) + r1.getTop();
                    float measuredHeight = getMeasuredHeight() - o.K(this, 8);
                    a(this, canvas, -65536, K3);
                    a(this, canvas, -65536, measuredHeight);
                    return;
                }
                DialogActionButtonLayout dialogActionButtonLayout3 = this.buttonsLayout;
                if (dialogActionButtonLayout3 != null) {
                    for (DialogActionButton dialogActionButton2 : dialogActionButtonLayout3.getVisibleButtons()) {
                        if (this.buttonsLayout == null) {
                            Intrinsics.j();
                        }
                        float K4 = o.K(this, 8) + r2.getTop() + dialogActionButton2.getTop();
                        if (this.buttonsLayout == null) {
                            Intrinsics.j();
                        }
                        canvas.drawRect(dialogActionButton2.getLeft() + o.K(this, 4), K4, dialogActionButton2.getRight() - o.K(this, 4), r2.getBottom() - o.K(this, 8), b(-16711681, 0.4f));
                    }
                    if (this.buttonsLayout == null) {
                        Intrinsics.j();
                    }
                    a(this, canvas, -65281, r1.getTop());
                    float measuredHeight2 = getMeasuredHeight() - (o.K(this, 52) - o.K(this, 8));
                    float measuredHeight3 = getMeasuredHeight() - o.K(this, 8);
                    a(this, canvas, -65536, measuredHeight2);
                    a(this, canvas, -65536, measuredHeight3);
                    a(this, canvas, -16776961, measuredHeight2 - o.K(this, 8));
                    return;
                }
                return;
            }
            Intrinsics.k("contentLayout");
            throw null;
        }
        Intrinsics.k("titleLayout");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_title_layout);
        Intrinsics.b(findViewById, "findViewById(R.id.md_title_layout)");
        this.titleLayout = (DialogTitleLayout) findViewById;
        View findViewById2 = findViewById(R.id.md_content_layout);
        Intrinsics.b(findViewById2, "findViewById(R.id.md_content_layout)");
        this.contentLayout = (DialogContentLayout) findViewById2;
        this.buttonsLayout = (DialogActionButtonLayout) findViewById(R.id.md_button_layout);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int i14;
        int measuredWidth = getMeasuredWidth();
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout != null) {
            int measuredHeight2 = dialogTitleLayout.getMeasuredHeight();
            DialogTitleLayout dialogTitleLayout2 = this.titleLayout;
            if (dialogTitleLayout2 != null) {
                dialogTitleLayout2.layout(0, 0, measuredWidth, measuredHeight2);
                if (this.f8338j) {
                    int measuredHeight3 = getMeasuredHeight();
                    DialogActionButtonLayout dialogActionButtonLayout = this.buttonsLayout;
                    if (dialogActionButtonLayout != null) {
                        i14 = dialogActionButtonLayout.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    measuredHeight = measuredHeight3 - i14;
                    if (o.W(this.buttonsLayout)) {
                        int measuredWidth2 = getMeasuredWidth();
                        int measuredHeight4 = getMeasuredHeight();
                        DialogActionButtonLayout dialogActionButtonLayout2 = this.buttonsLayout;
                        if (dialogActionButtonLayout2 == null) {
                            Intrinsics.j();
                        }
                        dialogActionButtonLayout2.layout(0, measuredHeight, measuredWidth2, measuredHeight4);
                    }
                } else {
                    measuredHeight = getMeasuredHeight();
                }
                int measuredWidth3 = getMeasuredWidth();
                DialogContentLayout dialogContentLayout = this.contentLayout;
                if (dialogContentLayout != null) {
                    dialogContentLayout.layout(0, measuredHeight2, measuredWidth3, measuredHeight);
                    return;
                } else {
                    Intrinsics.k("contentLayout");
                    throw null;
                }
            }
            Intrinsics.k("titleLayout");
            throw null;
        }
        Intrinsics.k("titleLayout");
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = this.maxHeight;
        if (1 <= i13 && size2 > i13) {
            size2 = i13;
        }
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout != null) {
            int i14 = 0;
            dialogTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (o.W(this.buttonsLayout)) {
                DialogActionButtonLayout dialogActionButtonLayout = this.buttonsLayout;
                if (dialogActionButtonLayout == null) {
                    Intrinsics.j();
                }
                dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            DialogTitleLayout dialogTitleLayout2 = this.titleLayout;
            if (dialogTitleLayout2 != null) {
                int measuredHeight = dialogTitleLayout2.getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.buttonsLayout;
                if (dialogActionButtonLayout2 != null) {
                    i12 = dialogActionButtonLayout2.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i15 = size2 - (measuredHeight + i12);
                DialogContentLayout dialogContentLayout = this.contentLayout;
                if (dialogContentLayout != null) {
                    dialogContentLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE));
                    if (this.layoutMode == a.f15098a) {
                        DialogTitleLayout dialogTitleLayout3 = this.titleLayout;
                        if (dialogTitleLayout3 != null) {
                            int measuredHeight2 = dialogTitleLayout3.getMeasuredHeight();
                            DialogContentLayout dialogContentLayout2 = this.contentLayout;
                            if (dialogContentLayout2 != null) {
                                int measuredHeight3 = dialogContentLayout2.getMeasuredHeight() + measuredHeight2;
                                DialogActionButtonLayout dialogActionButtonLayout3 = this.buttonsLayout;
                                if (dialogActionButtonLayout3 != null) {
                                    i14 = dialogActionButtonLayout3.getMeasuredHeight();
                                }
                                setMeasuredDimension(size, measuredHeight3 + i14);
                                return;
                            }
                            Intrinsics.k("contentLayout");
                            throw null;
                        }
                        Intrinsics.k("titleLayout");
                        throw null;
                    }
                    setMeasuredDimension(size, this.f8339k);
                    return;
                }
                Intrinsics.k("contentLayout");
                throw null;
            }
            Intrinsics.k("titleLayout");
            throw null;
        }
        Intrinsics.k("titleLayout");
        throw null;
    }

    public final void setButtonsLayout(DialogActionButtonLayout dialogActionButtonLayout) {
        this.buttonsLayout = dialogActionButtonLayout;
    }

    public final void setContentLayout(@NotNull DialogContentLayout dialogContentLayout) {
        Intrinsics.e(dialogContentLayout, "<set-?>");
        this.contentLayout = dialogContentLayout;
    }

    public final void setDebugMode(boolean z10) {
        this.debugMode = z10;
        setWillNotDraw(!z10);
    }

    public final void setDialog(@NotNull b bVar) {
        Intrinsics.e(bVar, "<set-?>");
    }

    public final void setLayoutMode(@NotNull a aVar) {
        Intrinsics.e(aVar, "<set-?>");
        this.layoutMode = aVar;
    }

    public final void setMaxHeight(int i10) {
        this.maxHeight = i10;
    }

    public final void setTitleLayout(@NotNull DialogTitleLayout dialogTitleLayout) {
        Intrinsics.e(dialogTitleLayout, "<set-?>");
        this.titleLayout = dialogTitleLayout;
    }
}
