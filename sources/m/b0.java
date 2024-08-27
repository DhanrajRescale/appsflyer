package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class b0 extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final s f25489a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f25490b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n3.a(context);
        this.f25491c = false;
        m3.a(getContext(), this);
        s sVar = new s(this);
        this.f25489a = sVar;
        sVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f25490b = c0Var;
        c0Var.f(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f25489a;
        if (sVar != null) {
            sVar.a();
        }
        c0 c0Var = this.f25490b;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f25489a;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f25489a;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        o3 o3Var;
        c0 c0Var = this.f25490b;
        if (c0Var == null || (o3Var = (o3) c0Var.f25503e) == null) {
            return null;
        }
        return (ColorStateList) o3Var.f25672d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o3 o3Var;
        c0 c0Var = this.f25490b;
        if (c0Var == null || (o3Var = (o3) c0Var.f25503e) == null) {
            return null;
        }
        return (PorterDuff.Mode) o3Var.f25673e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(((ImageView) this.f25490b.f25501c).getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f25489a;
        if (sVar != null) {
            sVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f25489a;
        if (sVar != null) {
            sVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c0 c0Var = this.f25490b;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        c0 c0Var = this.f25490b;
        if (c0Var != null && drawable != null && !this.f25491c) {
            c0Var.f25500b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0Var != null) {
            c0Var.c();
            if (!this.f25491c && ((ImageView) c0Var.f25501c).getDrawable() != null) {
                ((ImageView) c0Var.f25501c).getDrawable().setLevel(c0Var.f25500b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f25491c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f25490b.h(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        c0 c0Var = this.f25490b;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f25489a;
        if (sVar != null) {
            sVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f25489a;
        if (sVar != null) {
            sVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f25490b;
        if (c0Var != null) {
            c0Var.i(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f25490b;
        if (c0Var != null) {
            c0Var.j(mode);
        }
    }
}
