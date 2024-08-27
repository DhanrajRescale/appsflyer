package gc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.navigation.t;
import ba.nk;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.assetgro.stockgro.missions.presentation.history.MissionStatusDetailFragment;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionStatusDetailFragment f17244b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(MissionStatusDetailFragment missionStatusDetailFragment, int i10) {
        super(1);
        this.f17243a = i10;
        this.f17244b = missionStatusDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17243a;
        MissionStatusDetailFragment missionStatusDetailFragment = this.f17244b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                nk nkVar = (nk) missionStatusDetailFragment.q();
                Intrinsics.c(bool);
                nkVar.f5576t.setVisibility(el.l.u(bool.booleanValue()));
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                Intrinsics.c(list);
                if (!list.isEmpty()) {
                    h hVar = missionStatusDetailFragment.f8888g;
                    if (hVar != null) {
                        hVar.u(list);
                    } else {
                        Intrinsics.k("missionHistoryTimelineAdapter");
                        throw null;
                    }
                }
                return Unit.f23355a;
            case 2:
                Context context = missionStatusDetailFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Context requireContext = missionStatusDetailFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String text = ((z9.i) obj).a(requireContext);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
            case 3:
                nk nkVar2 = (nk) missionStatusDetailFragment.q();
                String string = missionStatusDetailFragment.getString(R.string.hey_with_comma);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                nkVar2.A.setText(a3.a.m(new Object[]{(String) obj}, 1, string, "format(...)"));
                return Unit.f23355a;
            default:
                UserTask task = (UserTask) obj;
                Intrinsics.checkNotNullParameter(task, "it");
                Intrinsics.checkNotNullParameter(task, "task");
                missionStatusDetailFragment.x(yk.o.G(String.valueOf(task.getId()), String.valueOf(task.getSet()), task.getStatus(), task.getTaskType(), task.getReward().getType(), String.valueOf(task.getReward().getAmount()), task.getTitle(), "mission_history", task.getEventName()));
                t h10 = q6.l.h(missionStatusDetailFragment);
                String taskId = String.valueOf(task.getId());
                Intrinsics.checkNotNullParameter(taskId, "taskId");
                h10.o(new n(taskId));
                return Unit.f23355a;
        }
    }
}
