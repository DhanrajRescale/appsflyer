package ls;

import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f25295b;

    public /* synthetic */ r(v vVar, int i10) {
        this.f25294a = i10;
        this.f25295b = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.animation.Interpolator, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25294a;
        v vVar = this.f25295b;
        switch (i10) {
            case 0:
                v.a(vVar);
                return;
            default:
                vVar.f25316i.setVisibility(0);
                vVar.f25316i.setOnTouchListener(new s(this));
                ImageView imageView = (ImageView) vVar.f25316i.findViewById(R.id.com_mixpanel_android_notification_image);
                float applyDimension = TypedValue.applyDimension(1, 65.0f, vVar.f25309b.getResources().getDisplayMetrics());
                TranslateAnimation translateAnimation = new TranslateAnimation(s0.g.f34069a, s0.g.f34069a, applyDimension, s0.g.f34069a);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                translateAnimation.setDuration(200L);
                vVar.f25316i.startAnimation(translateAnimation);
                float f10 = applyDimension / 2.0f;
                ScaleAnimation scaleAnimation = new ScaleAnimation(s0.g.f34069a, 1.0f, s0.g.f34069a, 1.0f, f10, f10);
                scaleAnimation.setInterpolator(new Object());
                scaleAnimation.setDuration(400L);
                scaleAnimation.setStartOffset(200L);
                imageView.startAnimation(scaleAnimation);
                return;
        }
    }
}
