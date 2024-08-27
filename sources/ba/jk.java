package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.assetgro.stockgro.missions.presentation.widget.MissionDetailCTAWidget;
import com.assetgro.stockgro.missions.presentation.widget.MissionTaskBannerView;

/* loaded from: classes.dex */
public abstract class jk extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final r6 f5149s;

    /* renamed from: t, reason: collision with root package name */
    public final MissionTaskBannerView f5150t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f5151u;

    /* renamed from: v, reason: collision with root package name */
    public final MissionDetailCTAWidget f5152v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f5153w;

    /* renamed from: x, reason: collision with root package name */
    public MissionTaskDetailViewModel f5154x;

    public jk(Object obj, View view, r6 r6Var, MissionTaskBannerView missionTaskBannerView, ConstraintLayout constraintLayout, MissionDetailCTAWidget missionDetailCTAWidget, Toolbar toolbar) {
        super(obj, view, 1);
        this.f5149s = r6Var;
        this.f5150t = missionTaskBannerView;
        this.f5151u = constraintLayout;
        this.f5152v = missionDetailCTAWidget;
        this.f5153w = toolbar;
    }
}
