package cv;

import bv.e0;
import bv.l;
import iu.k;
import iu.v;
import iu.y;
import iu.z;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f13116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13117b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f13118c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f13119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f13120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f13121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f13122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f13123h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13124i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v vVar, long j10, y yVar, e0 e0Var, y yVar2, y yVar3, z zVar, z zVar2, z zVar3) {
        super(2);
        this.f13116a = vVar;
        this.f13117b = j10;
        this.f13118c = yVar;
        this.f13119d = e0Var;
        this.f13120e = yVar2;
        this.f13121f = yVar3;
        this.f13122g = zVar;
        this.f13123h = zVar2;
        this.f13124i = zVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j10;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        l lVar = this.f13119d;
        if (intValue != 1) {
            if (intValue == 10) {
                if (longValue >= 4) {
                    lVar.skip(4L);
                    hl.f.J0(lVar, (int) (longValue - 4), new h(this.f13122g, lVar, this.f13123h, this.f13124i));
                } else {
                    throw new IOException("bad zip: NTFS extra too short");
                }
            }
        } else {
            v vVar = this.f13116a;
            if (!vVar.f20556a) {
                vVar.f20556a = true;
                if (longValue >= this.f13117b) {
                    y yVar = this.f13118c;
                    long j11 = yVar.f20559a;
                    if (j11 == 4294967295L) {
                        j11 = lVar.Q();
                    }
                    yVar.f20559a = j11;
                    y yVar2 = this.f13120e;
                    long j12 = 0;
                    if (yVar2.f20559a == 4294967295L) {
                        j10 = lVar.Q();
                    } else {
                        j10 = 0;
                    }
                    yVar2.f20559a = j10;
                    y yVar3 = this.f13121f;
                    if (yVar3.f20559a == 4294967295L) {
                        j12 = lVar.Q();
                    }
                    yVar3.f20559a = j12;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return Unit.f23355a;
    }
}
