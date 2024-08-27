package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.missions.presentation.home.MissionListItemViewModel;
import com.assetgro.stockgro.missions.presentation.widget.MissionProgressBarView;

/* loaded from: classes.dex */
public abstract class ja extends m4.m {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f5123y = 0;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f5124s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f5125t;

    /* renamed from: u, reason: collision with root package name */
    public final MissionProgressBarView f5126u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5127v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f5128w;

    /* renamed from: x, reason: collision with root package name */
    public MissionListItemViewModel f5129x;

    public ja(Object obj, View view, TextView textView, ImageView imageView, MissionProgressBarView missionProgressBarView, TextView textView2, ImageView imageView2) {
        super(obj, view, 6);
        this.f5124s = textView;
        this.f5125t = imageView;
        this.f5126u = missionProgressBarView;
        this.f5127v = textView2;
        this.f5128w = imageView2;
    }
}
