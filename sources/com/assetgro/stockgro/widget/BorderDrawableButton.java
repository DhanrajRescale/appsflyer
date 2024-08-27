package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.g5;
import com.assetgro.stockgro.prod.R;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r3.k;
import t3.p;
import yk.u;
import z9.b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/widget/BorderDrawableButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "enabled", HttpUrl.FRAGMENT_ENCODE_SET, "setEnabled", "Landroid/view/View$OnClickListener;", "newListener", "setOnClickListener", HttpUrl.FRAGMENT_ENCODE_SET, "text", "setBdbText", "Lba/g5;", "t", "Lba/g5;", "getBinding", "()Lba/g5;", "setBinding", "(Lba/g5;)V", "binding", HttpUrl.FRAGMENT_ENCODE_SET, u.f41726f, "I", "getTextColor", "()I", "setTextColor", "(I)V", "textColor", "Landroid/graphics/drawable/Drawable;", "w", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BorderDrawableButton extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public View.OnClickListener f10588s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public g5 binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public int textColor;

    /* renamed from: v, reason: collision with root package name */
    public final int f10591v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Drawable drawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderDrawableButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10588s = null;
        setClickable(true);
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = g5.f4780t;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        g5 g5Var = (g5) m.g(from, R.layout.border_drawable_button, this, true, null);
        Intrinsics.checkNotNullExpressionValue(g5Var, "inflate(...)");
        this.binding = g5Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f42189a);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = obtainStyledAttributes.getColor(1, k.getColor(context, R.color.white));
        int color2 = obtainStyledAttributes.getColor(0, k.getColor(context, R.color.black_1A1A1A));
        int resourceId = obtainStyledAttributes.getResourceId(4, R.drawable.ic_prepzone_finished_green);
        this.f10591v = resourceId;
        String string = obtainStyledAttributes.getString(2);
        this.textColor = obtainStyledAttributes.getColor(3, k.getColor(context, R.color.black));
        int color3 = obtainStyledAttributes.getColor(5, 0);
        TextView textView = this.binding.f4781s;
        Intrinsics.d(textView, "null cannot be cast to non-null type android.widget.TextView");
        textView.setTypeface(p.a(R.font.inter_400, context));
        textView.setText(string);
        textView.setTextColor(this.textColor);
        if (color3 != 0) {
            Drawable drawable = k.getDrawable(context, resourceId);
            if (drawable != null) {
                Intrinsics.checkNotNullExpressionValue(drawable, "wrap(...)");
                v3.b.g(drawable, color3);
            } else {
                drawable = null;
            }
            this.drawable = drawable;
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            Drawable drawable2 = k.getDrawable(context, resourceId);
            this.drawable = drawable2;
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(f.j(4));
        gradientDrawable.setStroke(2, color2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(k.getColor(context, R.color.grey_C4C4C4));
        gradientDrawable2.setCornerRadius(f.j(4));
        gradientDrawable2.setStroke(2, k.getColor(context, R.color.grey_C4C4C4));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable);
        setBackground(stateListDrawable);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.dp_2));
        obtainStyledAttributes.recycle();
    }

    @NotNull
    public final g5 getBinding() {
        return this.binding;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final void setBdbText(String text) {
        this.binding.f4781s.setText(text);
    }

    public final void setBinding(@NotNull g5 g5Var) {
        Intrinsics.checkNotNullParameter(g5Var, "<set-?>");
        this.binding = g5Var;
    }

    public final void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            super.setOnClickListener(this.f10588s);
            return;
        }
        this.binding.f4781s.setTextColor(Color.parseColor("#FF1A1A1A"));
        Drawable drawable = k.getDrawable(getContext(), this.f10591v);
        if (drawable != null) {
            int parseColor = Color.parseColor("#FF1A1A1A");
            Intrinsics.checkNotNullExpressionValue(drawable, "wrap(...)");
            v3.b.g(drawable, parseColor);
        } else {
            drawable = null;
        }
        this.drawable = drawable;
        this.binding.f4781s.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener newListener) {
        this.f10588s = newListener;
    }

    public final void setTextColor(int i10) {
        this.textColor = i10;
    }
}
