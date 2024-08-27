package cv;

import bv.e0;
import bv.l;
import iu.k;
import iu.z;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13111a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f13112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f13113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f13114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f13115e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e0 e0Var, z zVar, z zVar2, z zVar3) {
        super(2);
        this.f13112b = e0Var;
        this.f13113c = zVar;
        this.f13114d = zVar2;
        this.f13115e = zVar3;
    }

    public final void a(int i10, long j10) {
        boolean z10;
        boolean z11;
        int i11 = this.f13111a;
        z zVar = this.f13115e;
        z zVar2 = this.f13114d;
        z zVar3 = this.f13113c;
        l lVar = this.f13112b;
        boolean z12 = true;
        switch (i11) {
            case 0:
                if (i10 == 1) {
                    if (zVar3.f20560a == null) {
                        if (j10 == 24) {
                            zVar3.f20560a = Long.valueOf(lVar.Q());
                            zVar2.f20560a = Long.valueOf(lVar.Q());
                            zVar.f20560a = Long.valueOf(lVar.Q());
                            return;
                        }
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                }
                return;
            default:
                if (i10 == 21589) {
                    long j11 = 1;
                    if (j10 >= 1) {
                        byte readByte = lVar.readByte();
                        if ((readByte & 1) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((readByte & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((readByte & 4) != 4) {
                            z12 = false;
                        }
                        if (z10) {
                            j11 = 5;
                        }
                        if (z11) {
                            j11 += 4;
                        }
                        if (z12) {
                            j11 += 4;
                        }
                        if (j10 >= j11) {
                            if (z10) {
                                zVar3.f20560a = Integer.valueOf(lVar.L());
                            }
                            if (z11) {
                                zVar2.f20560a = Integer.valueOf(lVar.L());
                            }
                            if (z12) {
                                zVar.f20560a = Integer.valueOf(lVar.L());
                                return;
                            }
                            return;
                        }
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f13111a) {
            case 0:
                a(((Number) obj).intValue(), ((Number) obj2).longValue());
                return Unit.f23355a;
            default:
                a(((Number) obj).intValue(), ((Number) obj2).longValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, l lVar, z zVar2, z zVar3) {
        super(2);
        this.f13113c = zVar;
        this.f13112b = lVar;
        this.f13114d = zVar2;
        this.f13115e = zVar3;
    }
}
