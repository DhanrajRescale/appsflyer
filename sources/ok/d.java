package ok;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d extends a {

    /* renamed from: b, reason: collision with root package name */
    public final View f30102b;

    /* renamed from: c, reason: collision with root package name */
    public final h f30103c;

    /* renamed from: d, reason: collision with root package name */
    public Animatable f30104d;

    public d(ImageView imageView) {
        if (imageView != null) {
            this.f30102b = imageView;
            this.f30103c = new h(imageView);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // ok.g
    public final void a(Object obj) {
        i(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f30104d = animatable;
            animatable.start();
            return;
        }
        this.f30104d = null;
    }

    @Override // ok.g
    public final void b(f fVar) {
        int i10;
        h hVar = this.f30103c;
        View view = hVar.f30108a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i11 = 0;
        if (layoutParams != null) {
            i10 = layoutParams.width;
        } else {
            i10 = 0;
        }
        int a10 = hVar.a(view.getWidth(), i10, paddingRight);
        View view2 = hVar.f30108a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            i11 = layoutParams2.height;
        }
        int a11 = hVar.a(view2.getHeight(), i11, paddingBottom);
        if ((a10 <= 0 && a10 != Integer.MIN_VALUE) || (a11 <= 0 && a11 != Integer.MIN_VALUE)) {
            ArrayList arrayList = hVar.f30109b;
            if (!arrayList.contains(fVar)) {
                arrayList.add(fVar);
            }
            if (hVar.f30110c == null) {
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                o3.f fVar2 = new o3.f(hVar);
                hVar.f30110c = fVar2;
                viewTreeObserver.addOnPreDrawListener(fVar2);
                return;
            }
            return;
        }
        ((nk.g) fVar).o(a10, a11);
    }

    @Override // ok.a, ok.g
    public final void c(Drawable drawable) {
        i(null);
        this.f30104d = null;
        ((ImageView) this.f30102b).setImageDrawable(drawable);
    }

    @Override // ok.g
    public final void d(f fVar) {
        this.f30103c.f30109b.remove(fVar);
    }

    @Override // ok.a, ok.g
    public final void e(nk.b bVar) {
        this.f30102b.setTag(R.id.glide_custom_view_target_tag, bVar);
    }

    @Override // ok.a, ok.g
    public final void f(Drawable drawable) {
        i(null);
        this.f30104d = null;
        ((ImageView) this.f30102b).setImageDrawable(drawable);
    }

    @Override // ok.a, ok.g
    public final nk.b g() {
        Object tag = this.f30102b.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof nk.b) {
                return (nk.b) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // ok.a, ok.g
    public final void h(Drawable drawable) {
        h hVar = this.f30103c;
        ViewTreeObserver viewTreeObserver = hVar.f30108a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(hVar.f30110c);
        }
        hVar.f30110c = null;
        hVar.f30109b.clear();
        Animatable animatable = this.f30104d;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f30104d = null;
        ((ImageView) this.f30102b).setImageDrawable(drawable);
    }

    public abstract void i(Object obj);

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: " + this.f30102b;
    }

    @Override // ok.a, lk.e
    public final void onStart() {
        Animatable animatable = this.f30104d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // ok.a, lk.e
    public final void onStop() {
        Animatable animatable = this.f30104d;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
