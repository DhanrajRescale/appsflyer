package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.slider.Slider;

/* loaded from: classes.dex */
public abstract class aa extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final View f4179s;

    public aa(Object obj, View view, LinearLayout linearLayout) {
        super(obj, view, 0);
        this.f4179s = linearLayout;
    }

    public aa(Object obj, View view, Slider slider) {
        super(obj, view, 0);
        this.f4179s = slider;
    }

    public aa(Object obj, View view, RelativeLayout relativeLayout) {
        super(obj, view, 0);
        this.f4179s = relativeLayout;
    }
}
