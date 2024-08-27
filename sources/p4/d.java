package p4;

import android.view.View;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f30634g;

    public d(int i10) {
        this.f30634g = i10;
    }

    @Override // vl.b
    public final /* bridge */ /* synthetic */ float E(Object obj) {
        switch (this.f30634g) {
            case 0:
                return t0((View) obj);
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                return t0((View) obj);
            case 2:
                return t0((View) obj);
            case 8:
                return t0((View) obj);
            case 9:
                return t0((View) obj);
            case 10:
                return t0((View) obj);
            case 11:
                return t0((View) obj);
            case 12:
                return t0((View) obj);
        }
    }

    @Override // vl.b
    public final /* bridge */ /* synthetic */ void m0(float f10, Object obj) {
        switch (this.f30634g) {
            case 0:
                u0((View) obj, f10);
                return;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                u0((View) obj, f10);
                return;
            case 2:
                u0((View) obj, f10);
                return;
            case 8:
                u0((View) obj, f10);
                return;
            case 9:
                u0((View) obj, f10);
                return;
            case 10:
                u0((View) obj, f10);
                return;
            case 11:
                u0((View) obj, f10);
                return;
            case 12:
                u0((View) obj, f10);
                return;
        }
    }

    public final float t0(View view) {
        switch (this.f30634g) {
            case 0:
                return view.getY();
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                return view.getX();
            case 2:
                return view.getAlpha();
            case 8:
                return view.getScaleX();
            case 9:
                return view.getScaleY();
            case 10:
                return view.getRotation();
            case 11:
                return view.getRotationX();
            case 12:
                return view.getRotationY();
        }
    }

    public final void u0(View view, float f10) {
        switch (this.f30634g) {
            case 0:
                view.setY(f10);
                return;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                view.setX(f10);
                return;
            case 2:
                view.setAlpha(f10);
                return;
            case 8:
                view.setScaleX(f10);
                return;
            case 9:
                view.setScaleY(f10);
                return;
            case 10:
                view.setRotation(f10);
                return;
            case 11:
                view.setRotationX(f10);
                return;
            case 12:
                view.setRotationY(f10);
                return;
        }
    }
}
