package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import kq.e;
import s.a;
import s0.g;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    public static final int[] f1151f = {R.attr.colorBackground};

    /* renamed from: g */
    public static final e f1152g = new Object();

    /* renamed from: a */
    public boolean f1153a;

    /* renamed from: b */
    public boolean f1154b;

    /* renamed from: c */
    public final Rect f1155c;

    /* renamed from: d */
    public final Rect f1156d;

    /* renamed from: e */
    public final tr.e f1157e;

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.assetgro.stockgro.prod.R.attr.cardViewStyle);
    }

    public static /* synthetic */ void a(CardView cardView, int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((a) ((Drawable) this.f1157e.f36361b)).f34015h;
    }

    public float getCardElevation() {
        return ((CardView) this.f1157e.f36362c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1155c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1155c.left;
    }

    public int getContentPaddingRight() {
        return this.f1155c.right;
    }

    public int getContentPaddingTop() {
        return this.f1155c.top;
    }

    public float getMaxCardElevation() {
        return ((a) ((Drawable) this.f1157e.f36361b)).f34012e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1154b;
    }

    public float getRadius() {
        return ((a) ((Drawable) this.f1157e.f36361b)).f34008a;
    }

    public boolean getUseCompatPadding() {
        return this.f1153a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        a aVar = (a) ((Drawable) this.f1157e.f36361b);
        if (valueOf == null) {
            aVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        aVar.f34015h = valueOf;
        aVar.f34009b.setColor(valueOf.getColorForState(aVar.getState(), aVar.f34015h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.f1157e.f36362c).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f1152g.N(this.f1157e, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1154b) {
            this.f1154b = z10;
            e eVar = f1152g;
            tr.e eVar2 = this.f1157e;
            eVar.N(eVar2, ((a) ((Drawable) eVar2.f36361b)).f34012e);
        }
    }

    public void setRadius(float f10) {
        a aVar = (a) ((Drawable) this.f1157e.f36361b);
        if (f10 != aVar.f34008a) {
            aVar.f34008a = f10;
            aVar.b(null);
            aVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1153a != z10) {
            this.f1153a = z10;
            e eVar = f1152g;
            tr.e eVar2 = this.f1157e;
            eVar.N(eVar2, ((a) ((Drawable) eVar2.f36361b)).f34012e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1155c = rect;
        this.f1156d = new Rect();
        tr.e eVar = new tr.e(this);
        this.f1157e = eVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a.f32313a, i10, com.assetgro.stockgro.prod.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1151f);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.assetgro.stockgro.prod.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.assetgro.stockgro.prod.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, g.f34069a);
        float dimension2 = obtainStyledAttributes.getDimension(4, g.f34069a);
        float dimension3 = obtainStyledAttributes.getDimension(5, g.f34069a);
        this.f1153a = obtainStyledAttributes.getBoolean(7, false);
        this.f1154b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        e eVar2 = f1152g;
        a aVar = new a(dimension, valueOf);
        eVar.f36361b = aVar;
        ((CardView) eVar.f36362c).setBackgroundDrawable(aVar);
        CardView cardView = (CardView) eVar.f36362c;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        eVar2.N(eVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        a aVar = (a) ((Drawable) this.f1157e.f36361b);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f34015h = colorStateList;
        aVar.f34009b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f34015h.getDefaultColor()));
        aVar.invalidateSelf();
    }
}
