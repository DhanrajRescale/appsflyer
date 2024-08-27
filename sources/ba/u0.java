package ba;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.button.MaterialButton;
import com.takusemba.cropme.CropLayout;

/* loaded from: classes.dex */
public abstract class u0 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f6258s;

    /* renamed from: t, reason: collision with root package name */
    public final CropLayout f6259t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f6260u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f6261v;

    public u0(Object obj, View view, TextView textView, CropLayout cropLayout, MaterialButton materialButton, Toolbar toolbar) {
        super(obj, view, 0);
        this.f6258s = textView;
        this.f6259t = cropLayout;
        this.f6260u = materialButton;
        this.f6261v = toolbar;
    }
}
