package ls;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class v extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public n0 f25308a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f25309b;

    /* renamed from: c, reason: collision with root package name */
    public GestureDetector f25310c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f25311d;

    /* renamed from: e, reason: collision with root package name */
    public int f25312e;

    /* renamed from: f, reason: collision with root package name */
    public e1 f25313f;

    /* renamed from: g, reason: collision with root package name */
    public r f25314g;

    /* renamed from: h, reason: collision with root package name */
    public r f25315h;

    /* renamed from: i, reason: collision with root package name */
    public View f25316i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f25317j = new AtomicBoolean();

    public static void a(v vVar) {
        boolean isDestroyed = vVar.f25309b.isDestroyed();
        Activity activity = vVar.f25309b;
        if (activity != null && !activity.isFinishing() && !isDestroyed) {
            AtomicBoolean atomicBoolean = vVar.f25317j;
            if (!atomicBoolean.get()) {
                vVar.f25311d.removeCallbacks(vVar.f25314g);
                vVar.f25311d.removeCallbacks(vVar.f25315h);
                FragmentManager fragmentManager = vVar.f25309b.getFragmentManager();
                try {
                    fragmentManager.beginTransaction().setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down).remove(vVar).commit();
                } catch (IllegalStateException unused) {
                    fragmentManager.beginTransaction().setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down).remove(vVar).commitAllowingStateLoss();
                }
                g1.c(vVar.f25312e);
                atomicBoolean.set(true);
            }
        }
    }

    public final void b() {
        AtomicBoolean atomicBoolean = this.f25317j;
        if (!atomicBoolean.get()) {
            Handler handler = this.f25311d;
            if (handler != null) {
                handler.removeCallbacks(this.f25314g);
                this.f25311d.removeCallbacks(this.f25315h);
            }
            g1.c(this.f25312e);
            FragmentManager fragmentManager = this.f25309b.getFragmentManager();
            try {
                fragmentManager.beginTransaction().remove(this).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }
        atomicBoolean.set(true);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f25309b = activity;
        if (this.f25313f == null) {
            b();
            return;
        }
        this.f25311d = new Handler();
        this.f25314g = new r(this, 0);
        this.f25315h = new r(this, 1);
        this.f25310c = new GestureDetector(activity, new t(this));
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25317j.set(false);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f25313f == null) {
            b();
        } else {
            View inflate = layoutInflater.inflate(R.layout.com_mixpanel_android_activity_notification_mini, viewGroup, false);
            this.f25316i = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.com_mixpanel_android_notification_title);
            ImageView imageView = (ImageView) this.f25316i.findViewById(R.id.com_mixpanel_android_notification_image);
            h0 h0Var = (h0) this.f25313f.f25182a;
            textView.setText(h0Var.f25115f);
            textView.setTextColor(h0Var.f25116g);
            imageView.setImageBitmap(h0Var.f25119j);
            this.f25311d.postDelayed(this.f25314g, 10000L);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(h0Var.f25114e);
            gradientDrawable.setCornerRadius((getActivity().getResources().getDisplayMetrics().densityDpi / 160.0f) * 7.0f);
            gradientDrawable.setStroke((int) ((getActivity().getResources().getDisplayMetrics().densityDpi / 160.0f) * 2.0f), h0Var.f25222n);
            this.f25316i.setBackground(gradientDrawable);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f25313f.f25182a.f25119j);
            bitmapDrawable.setColorFilter(h0Var.f25221m, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(bitmapDrawable);
        }
        return this.f25316i;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        b();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f25311d.postDelayed(this.f25315h, 500L);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f25317j.get()) {
            this.f25309b.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }
}
