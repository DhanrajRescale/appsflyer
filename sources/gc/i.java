package gc;

import ba.ha;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f17238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i10) {
        super(1);
        this.f17237a = i10;
        this.f17238b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17237a;
        j jVar = this.f17238b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                e eVar = jVar.f17240y;
                if (eVar != null) {
                    eVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("missionHistoryTaskAdapter");
                throw null;
            case 1:
                ((ha) jVar.f17291u).f4919s.setText((String) obj);
                return Unit.f23355a;
            default:
                UserTask it = (UserTask) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                jVar.f17239x.invoke(it);
                return Unit.f23355a;
        }
    }
}
