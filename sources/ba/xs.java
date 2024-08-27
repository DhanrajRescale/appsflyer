package ba;

import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.assetgro.stockgro.missions.presentation.widget.MissionInputView;

/* loaded from: classes.dex */
public abstract class xs extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f6676s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6677t;

    /* renamed from: u, reason: collision with root package name */
    public final MissionInputView f6678u;

    /* renamed from: v, reason: collision with root package name */
    public MissionTaskDetailViewModel f6679v;

    public xs(Object obj, View view, TextView textView, TextView textView2, MissionInputView missionInputView) {
        super(obj, view, 1);
        this.f6676s = textView;
        this.f6677t = textView2;
        this.f6678u = missionInputView;
    }
}
