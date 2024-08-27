package hc;

import android.view.View;
import ba.bt;
import ba.ja;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.assetgro.stockgro.missions.presentation.home.MissionListItemViewModel;
import com.assetgro.stockgro.missions.presentation.widget.MissionProgressBarView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f18252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f18251a = i10;
        this.f18252b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f18251a;
        c cVar = this.f18252b;
        switch (i10) {
            case 0:
                Pair pair = (Pair) obj;
                MissionProgressBarView missionProgressBarView = ((ja) cVar.f17291u).f5126u;
                boolean booleanValue = ((Boolean) pair.f23353a).booleanValue();
                int intValue = ((Number) pair.f23354b).intValue();
                bt btVar = missionProgressBarView.f8938s;
                if (!booleanValue) {
                    btVar.f4318t.setVisibility(4);
                } else if (intValue > 0) {
                    CircularProgressIndicator circularProgressIndicator = btVar.f4317s;
                    circularProgressIndicator.setProgress(intValue);
                    circularProgressIndicator.setVisibility(0);
                } else {
                    btVar.f4317s.setVisibility(4);
                }
                return Unit.f23355a;
            case 1:
                ((ja) cVar.f17291u).f5126u.setTimeLeftText((String) obj);
                return Unit.f23355a;
            case 2:
                Integer num = (Integer) obj;
                MissionProgressBarView missionProgressBarView2 = ((ja) cVar.f17291u).f5126u;
                Intrinsics.c(num);
                missionProgressBarView2.setTrackColor(num.intValue());
                return Unit.f23355a;
            default:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                UserTask userTask = (UserTask) ((MissionListItemViewModel) cVar.v()).f9075c.getValue();
                if (userTask != null) {
                    cVar.f18253x.invoke(userTask);
                }
                return Unit.f23355a;
        }
    }
}
