package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.prod.R;
import o3.b;
import o3.e;
import s0.g;

/* loaded from: classes.dex */
public class ImagePositionChange extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10629a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10630b;

    /* renamed from: c, reason: collision with root package name */
    public int f10631c;

    /* renamed from: d, reason: collision with root package name */
    public float f10632d;

    /* renamed from: e, reason: collision with root package name */
    public int f10633e;

    /* renamed from: f, reason: collision with root package name */
    public int f10634f;

    /* renamed from: g, reason: collision with root package name */
    public int f10635g;

    /* renamed from: h, reason: collision with root package name */
    public int f10636h;

    /* renamed from: i, reason: collision with root package name */
    public float f10637i;

    public ImagePositionChange(Context context, AttributeSet attributeSet) {
        this.f10629a = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z9.b.f42195g);
            obtainStyledAttributes.getDimension(1, g.f34069a);
            obtainStyledAttributes.getDimension(4, g.f34069a);
            obtainStyledAttributes.getDimension(3, g.f34069a);
            obtainStyledAttributes.getDimension(2, g.f34069a);
            this.f10630b = obtainStyledAttributes.getDimension(0, g.f34069a);
            obtainStyledAttributes.recycle();
        }
        context.getResources().getDimension(R.dimen.image_width);
        context.getResources().getDimension(R.dimen.spacing_normal);
    }

    @Override // o3.b
    public final boolean b(View view, View view2) {
        return view2 instanceof Toolbar;
    }

    @Override // o3.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ImageView imageView = (ImageView) view;
        if (this.f10633e == 0) {
            this.f10633e = (int) view2.getY();
        }
        if (this.f10634f == 0) {
            this.f10634f = view2.getHeight() / 2;
        }
        if (this.f10635g == 0) {
            this.f10635g = imageView.getHeight();
        }
        if (this.f10631c == 0) {
            this.f10631c = (int) (imageView.getX() + (imageView.getWidth() / 2));
        }
        int i10 = this.f10636h;
        float f10 = this.f10630b;
        if (i10 == 0) {
            this.f10636h = (((int) f10) / 2) + this.f10629a.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_content_inset_material);
        }
        if (this.f10632d == g.f34069a) {
            this.f10632d = view2.getY();
        }
        if (this.f10637i == g.f34069a) {
            this.f10637i = (imageView.getHeight() - f10) / ((this.f10633e - this.f10634f) * 2.0f);
        }
        float y10 = view2.getY() / ((int) this.f10632d);
        float f11 = this.f10637i;
        if (y10 < f11) {
            float f12 = (f11 - y10) / f11;
            imageView.setX(this.f10631c - (((this.f10631c - this.f10636h) * f12) + (imageView.getHeight() / 2)));
            imageView.setY(this.f10633e - (((1.0f - y10) * (this.f10633e - this.f10634f)) + (imageView.getHeight() / 2)));
            e eVar = (e) imageView.getLayoutParams();
            int i11 = (int) (this.f10635g - ((this.f10635g - f10) * f12));
            ((ViewGroup.MarginLayoutParams) eVar).width = i11;
            ((ViewGroup.MarginLayoutParams) eVar).height = i11;
            imageView.setLayoutParams(eVar);
            return true;
        }
        imageView.setX(this.f10631c - (imageView.getWidth() / 2));
        imageView.setY(this.f10633e - (((1.0f - y10) * (this.f10633e - this.f10634f)) + (this.f10635g / 2)));
        e eVar2 = (e) imageView.getLayoutParams();
        int i12 = this.f10635g;
        ((ViewGroup.MarginLayoutParams) eVar2).width = i12;
        ((ViewGroup.MarginLayoutParams) eVar2).height = i12;
        imageView.setLayoutParams(eVar2);
        return true;
    }
}
