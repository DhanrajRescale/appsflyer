package ba;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;

/* loaded from: classes.dex */
public abstract class d6 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f4446s;

    /* renamed from: t, reason: collision with root package name */
    public final ae f4447t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4448u;

    /* renamed from: v, reason: collision with root package name */
    public final View f4449v;

    /* renamed from: w, reason: collision with root package name */
    public MissionsHomeViewModel f4450w;

    public d6(Object obj, View view, ConstraintLayout constraintLayout, ae aeVar, TextView textView, View view2) {
        super(obj, view, 2);
        this.f4446s = constraintLayout;
        this.f4447t = aeVar;
        this.f4448u = textView;
        this.f4449v = view2;
    }
}
