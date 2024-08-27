package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl.j;
import com.assetgro.stockgro.prod.R;
import h9.a;
import i9.c;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "Lh9/a;", "Landroid/widget/ImageView;", "i", "Landroid/widget/ImageView;", "getIconView$com_afollestad_material_dialogs_core", "()Landroid/widget/ImageView;", "setIconView$com_afollestad_material_dialogs_core", "(Landroid/widget/ImageView;)V", "iconView", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "getTitleView$com_afollestad_material_dialogs_core", "()Landroid/widget/TextView;", "setTitleView$com_afollestad_material_dialogs_core", "(Landroid/widget/TextView;)V", "titleView", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogTitleLayout extends a {

    /* renamed from: d, reason: collision with root package name */
    public final int f8341d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8342e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8343f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8344g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8345h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public ImageView iconView;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public TextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogTitleLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.e(context, "context");
        this.f8341d = c.a(this, R.dimen.md_dialog_frame_margin_vertical);
        this.f8342e = c.a(this, R.dimen.md_dialog_title_layout_margin_bottom);
        this.f8343f = c.a(this, R.dimen.md_dialog_frame_margin_horizontal);
        this.f8344g = c.a(this, R.dimen.md_icon_margin);
        this.f8345h = c.a(this, R.dimen.md_icon_size);
    }

    public final boolean b() {
        if (this.iconView != null) {
            if (!j.K(r0)) {
                if (this.titleView != null) {
                    if (!j.K(r0)) {
                        return true;
                    }
                } else {
                    Intrinsics.k("titleView");
                    throw null;
                }
            }
            return false;
        }
        Intrinsics.k("iconView");
        throw null;
    }

    @NotNull
    public final ImageView getIconView$com_afollestad_material_dialogs_core() {
        ImageView imageView = this.iconView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.k("iconView");
        throw null;
    }

    @NotNull
    public final TextView getTitleView$com_afollestad_material_dialogs_core() {
        TextView textView = this.titleView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.k("titleView");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.e(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(g.f34069a, getMeasuredHeight() - getDividerHeight(), getMeasuredWidth(), getMeasuredHeight(), a());
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_icon_title);
        Intrinsics.b(findViewById, "findViewById(R.id.md_icon_title)");
        this.iconView = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.md_text_title);
        Intrinsics.b(findViewById2, "findViewById(R.id.md_text_title)");
        this.titleView = (TextView) findViewById2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int i14;
        int measuredWidth2;
        if (b()) {
            return;
        }
        int measuredHeight = getMeasuredHeight() - this.f8342e;
        int i15 = measuredHeight - ((measuredHeight - this.f8341d) / 2);
        TextView textView = this.titleView;
        if (textView != null) {
            int measuredHeight2 = textView.getMeasuredHeight() / 2;
            int i16 = i15 - measuredHeight2;
            int i17 = measuredHeight2 + i15;
            boolean I = j.I(this);
            int i18 = this.f8343f;
            if (I) {
                measuredWidth = getMeasuredWidth() - i18;
                TextView textView2 = this.titleView;
                if (textView2 != null) {
                    i18 = measuredWidth - textView2.getMeasuredWidth();
                } else {
                    Intrinsics.k("titleView");
                    throw null;
                }
            } else {
                TextView textView3 = this.titleView;
                if (textView3 != null) {
                    measuredWidth = textView3.getMeasuredWidth() + i18;
                } else {
                    Intrinsics.k("titleView");
                    throw null;
                }
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                if (j.K(imageView)) {
                    ImageView imageView2 = this.iconView;
                    if (imageView2 != null) {
                        int measuredHeight3 = imageView2.getMeasuredHeight() / 2;
                        int i19 = i15 - measuredHeight3;
                        int i20 = i15 + measuredHeight3;
                        boolean I2 = j.I(this);
                        int i21 = this.f8344g;
                        if (I2) {
                            ImageView imageView3 = this.iconView;
                            if (imageView3 != null) {
                                i18 = measuredWidth - imageView3.getMeasuredWidth();
                                measuredWidth2 = i18 - i21;
                                TextView textView4 = this.titleView;
                                if (textView4 != null) {
                                    i14 = measuredWidth2 - textView4.getMeasuredWidth();
                                } else {
                                    Intrinsics.k("titleView");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("iconView");
                                throw null;
                            }
                        } else {
                            ImageView imageView4 = this.iconView;
                            if (imageView4 != null) {
                                measuredWidth = imageView4.getMeasuredWidth() + i18;
                                i14 = i21 + measuredWidth;
                                TextView textView5 = this.titleView;
                                if (textView5 != null) {
                                    measuredWidth2 = textView5.getMeasuredWidth() + i14;
                                } else {
                                    Intrinsics.k("titleView");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("iconView");
                                throw null;
                            }
                        }
                        ImageView imageView5 = this.iconView;
                        if (imageView5 != null) {
                            imageView5.layout(i18, i19, measuredWidth, i20);
                            measuredWidth = measuredWidth2;
                            i18 = i14;
                        } else {
                            Intrinsics.k("iconView");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("iconView");
                        throw null;
                    }
                }
                TextView textView6 = this.titleView;
                if (textView6 != null) {
                    textView6.layout(i18, i16, measuredWidth, i17);
                    return;
                } else {
                    Intrinsics.k("titleView");
                    throw null;
                }
            }
            Intrinsics.k("iconView");
            throw null;
        }
        Intrinsics.k("titleView");
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        if (b()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int i13 = size - (this.f8343f * 2);
        ImageView imageView = this.iconView;
        if (imageView != null) {
            if (j.K(imageView)) {
                ImageView imageView2 = this.iconView;
                if (imageView2 != null) {
                    int i14 = this.f8345h;
                    imageView2.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                    ImageView imageView3 = this.iconView;
                    if (imageView3 != null) {
                        i13 -= imageView3.getMeasuredWidth() + this.f8344g;
                    } else {
                        Intrinsics.k("iconView");
                        throw null;
                    }
                } else {
                    Intrinsics.k("iconView");
                    throw null;
                }
            }
            TextView textView = this.titleView;
            if (textView != null) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                ImageView imageView4 = this.iconView;
                if (imageView4 != null) {
                    if (j.K(imageView4)) {
                        ImageView imageView5 = this.iconView;
                        if (imageView5 != null) {
                            i12 = imageView5.getMeasuredHeight();
                        } else {
                            Intrinsics.k("iconView");
                            throw null;
                        }
                    }
                    TextView textView2 = this.titleView;
                    if (textView2 != null) {
                        setMeasuredDimension(size, Math.max(i12, textView2.getMeasuredHeight()) + this.f8341d + this.f8342e);
                        return;
                    } else {
                        Intrinsics.k("titleView");
                        throw null;
                    }
                }
                Intrinsics.k("iconView");
                throw null;
            }
            Intrinsics.k("titleView");
            throw null;
        }
        Intrinsics.k("iconView");
        throw null;
    }

    public final void setIconView$com_afollestad_material_dialogs_core(@NotNull ImageView imageView) {
        Intrinsics.e(imageView, "<set-?>");
        this.iconView = imageView;
    }

    public final void setTitleView$com_afollestad_material_dialogs_core(@NotNull TextView textView) {
        Intrinsics.e(textView, "<set-?>");
        this.titleView = textView;
    }
}
