package hc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.j0;
import androidx.navigation.t;
import androidx.recyclerview.widget.RecyclerView;
import ba.ae;
import ba.kt;
import ba.lk;
import com.assetgro.stockgro.missions.domain.model.MissionsHomeData;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeFragment;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import tu.k1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionsHomeFragment f18273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(MissionsHomeFragment missionsHomeFragment, int i10) {
        super(1);
        this.f18272a = i10;
        this.f18273b = missionsHomeFragment;
    }

    public final void a(Boolean bool) {
        int i10 = this.f18272a;
        MissionsHomeFragment missionsHomeFragment = this.f18273b;
        switch (i10) {
            case 0:
                j0 activity = missionsHomeFragment.getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                    return;
                }
                return;
            default:
                lk lkVar = (lk) missionsHomeFragment.q();
                Intrinsics.c(bool);
                lkVar.f5367y.setVisibility(el.l.u(bool.booleanValue()));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k1 k1Var;
        Object value;
        int i10 = this.f18272a;
        MissionsHomeFragment missionsHomeFragment = this.f18273b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                Pair pair = (Pair) obj;
                kt ktVar = ((lk) missionsHomeFragment.q()).f5366x;
                ktVar.f5292u.setText((CharSequence) pair.f23353a);
                ImageView userDisplayImage = ktVar.f5291t;
                Intrinsics.checkNotNullExpressionValue(userDisplayImage, "userDisplayImage");
                zq.f.X(userDisplayImage, (String) pair.f23354b, R.drawable.ic_placeholder_user);
                return Unit.f23355a;
            case 3:
                List<UserTask> userTasks = ((MissionsHomeData) obj).getUserTasks();
                if (userTasks != null) {
                    View view = ((lk) missionsHomeFragment.q()).f5361s.f27491e;
                    Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                    missionsHomeFragment.F(view);
                    View view2 = ((lk) missionsHomeFragment.q()).f5365w.f27491e;
                    Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
                    missionsHomeFragment.F(view2);
                    if (!userTasks.isEmpty()) {
                        ae aeVar = ((lk) missionsHomeFragment.q()).f5361s.f4447t;
                        RecyclerView missionListRecyclerview = aeVar.f4186w;
                        Intrinsics.checkNotNullExpressionValue(missionListRecyclerview, "missionListRecyclerview");
                        missionsHomeFragment.F(missionListRecyclerview);
                        Space placeholder = aeVar.f4189z;
                        Intrinsics.checkNotNullExpressionValue(placeholder, "placeholder");
                        missionsHomeFragment.t(placeholder);
                        View layoutNoMissions = ((lk) missionsHomeFragment.q()).f5361s.f4449v;
                        Intrinsics.checkNotNullExpressionValue(layoutNoMissions, "layoutNoMissions");
                        missionsHomeFragment.t(layoutNoMissions);
                        a aVar = missionsHomeFragment.f8915i;
                        if (aVar != null) {
                            aVar.u(userTasks);
                        } else {
                            Intrinsics.k("missionListAdapter");
                            throw null;
                        }
                    } else {
                        View view3 = ((lk) missionsHomeFragment.q()).f5361s.f4447t.f27491e;
                        Intrinsics.checkNotNullExpressionValue(view3, "getRoot(...)");
                        missionsHomeFragment.t(view3);
                        View layoutNoMissions2 = ((lk) missionsHomeFragment.q()).f5361s.f4449v;
                        Intrinsics.checkNotNullExpressionValue(layoutNoMissions2, "layoutNoMissions");
                        missionsHomeFragment.F(layoutNoMissions2);
                    }
                }
                int i11 = MissionsHomeFragment.f8912j;
                ((lk) missionsHomeFragment.q()).f5368z.post(new androidx.activity.b(missionsHomeFragment, 25));
                return Unit.f23355a;
            case 4:
                Boolean bool = (Boolean) ((kj.j) obj).a();
                if (bool != null && bool.booleanValue()) {
                    ((MissionsHomeViewModel) missionsHomeFragment.r()).i();
                }
                return Unit.f23355a;
            case 5:
                Context context = missionsHomeFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Context requireContext = missionsHomeFragment.requireContext();
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
            case 6:
                Integer num = (Integer) obj;
                ProgressBar progressBar = ((lk) missionsHomeFragment.q()).f5361s.f4447t.f4187x;
                Intrinsics.c(num);
                progressBar.setProgress(num.intValue());
                float max = progressBar.getMax();
                ImageView imageViewPointer = ((lk) missionsHomeFragment.q()).f5361s.f4447t.f4183t;
                Intrinsics.checkNotNullExpressionValue(imageViewPointer, "imageViewPointer");
                ViewGroup.LayoutParams layoutParams = imageViewPointer.getLayoutParams();
                if (layoutParams != null) {
                    m3.d dVar = (m3.d) layoutParams;
                    dVar.E = num.intValue() / max;
                    imageViewPointer.setLayoutParams(dVar);
                    return Unit.f23355a;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            case 7:
                UserTask task = (UserTask) obj;
                Intrinsics.checkNotNullParameter(task, "it");
                Intrinsics.checkNotNullParameter(task, "task");
                missionsHomeFragment.B(yk.o.G(String.valueOf(task.getId()), String.valueOf(task.getSet()), task.getStatus(), task.getTaskType(), task.getReward().getType(), String.valueOf(task.getReward().getAmount()), task.getTitle(), "mission_home", task.getEventName()));
                t h10 = q6.l.h(missionsHomeFragment);
                String taskId = String.valueOf(task.getId());
                Intrinsics.checkNotNullParameter(taskId, "taskId");
                h10.o(new j(taskId));
                return Unit.f23355a;
            default:
                th.b selectedCard = (th.b) obj;
                Intrinsics.checkNotNullParameter(selectedCard, "it");
                int i12 = MissionsHomeFragment.f8912j;
                MissionsHomeViewModel missionsHomeViewModel = (MissionsHomeViewModel) missionsHomeFragment.r();
                Intrinsics.checkNotNullParameter(selectedCard, "selectedCard");
                do {
                    k1Var = missionsHomeViewModel.f8928z;
                    value = k1Var.getValue();
                } while (!k1Var.l(value, uh.i.a((uh.i) value, null, null, false, false, false, selectedCard, false, 95)));
                ((MissionsHomeViewModel) missionsHomeFragment.r()).j(new uh.g(true));
                lk lkVar = (lk) missionsHomeFragment.q();
                f fVar = new f(missionsHomeFragment, 0);
                Object obj2 = b1.d.f3079a;
                lkVar.f5363u.setContent(new b1.c(fVar, true, -2137624895));
                return Unit.f23355a;
        }
    }
}
