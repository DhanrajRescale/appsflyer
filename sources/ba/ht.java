package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class ht extends m4.m {
    public static final /* synthetic */ int B = 0;
    public String A;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f4971s;

    /* renamed from: t, reason: collision with root package name */
    public final ft f4972t;

    /* renamed from: u, reason: collision with root package name */
    public final dt f4973u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4974v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f4975w;

    /* renamed from: x, reason: collision with root package name */
    public String f4976x;

    /* renamed from: y, reason: collision with root package name */
    public String f4977y;

    /* renamed from: z, reason: collision with root package name */
    public String f4978z;

    public ht(Object obj, View view, ConstraintLayout constraintLayout, ft ftVar, dt dtVar, TextView textView, ImageView imageView) {
        super(obj, view, 2);
        this.f4971s = constraintLayout;
        this.f4972t = ftVar;
        this.f4973u = dtVar;
        this.f4974v = textView;
        this.f4975w = imageView;
    }
}
