package u7;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f36958a;

    /* renamed from: b, reason: collision with root package name */
    public m f36959b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f36960c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f36961d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36962e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f36963f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f36964g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f36965h;

    /* renamed from: i, reason: collision with root package name */
    public int f36966i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f36967j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f36968k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f36969l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f36958a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
