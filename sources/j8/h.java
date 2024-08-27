package j8;

import l7.s;
import l7.x;

/* loaded from: classes.dex */
public final class h extends x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, s sVar, int i10) {
        super(sVar);
        this.f21063d = i10;
        this.f21064e = obj;
    }

    @Override // l7.x
    public final String b() {
        switch (this.f21063d) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 1:
                return "DELETE FROM WorkProgress";
            default:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }
}
