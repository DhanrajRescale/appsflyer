package t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements s6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35440a;

    /* renamed from: b, reason: collision with root package name */
    public final List f35441b;

    public /* synthetic */ j(int i10, List list) {
        this.f35440a = i10;
        this.f35441b = list;
    }

    @Override // s6.b
    public final int a(long j10) {
        switch (this.f35440a) {
            case 0:
                return j10 < 0 ? 0 : -1;
            case 1:
            case 2:
                return -1;
            default:
                return j10 < 0 ? 0 : -1;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // s6.b
    public final long b(int i10) {
        boolean z10 = false;
        switch (this.f35440a) {
            case 0:
                if (i10 == 0) {
                    z10 = true;
                }
                yk.j.E0(z10);
                return 0L;
            default:
                if (i10 == 0) {
                    z10 = true;
                }
                yk.j.E0(z10);
            case 1:
            case 2:
                return 0L;
        }
    }

    @Override // s6.b
    public final List c(long j10) {
        int i10 = this.f35440a;
        List list = this.f35441b;
        switch (i10) {
            case 0:
                if (j10 < 0) {
                    return Collections.emptyList();
                }
                return list;
            case 1:
            case 2:
                return list;
            default:
                if (j10 < 0) {
                    return Collections.emptyList();
                }
                return list;
        }
    }

    @Override // s6.b
    public final int d() {
        return 1;
    }

    public j(ArrayList arrayList) {
        this.f35440a = 3;
        this.f35441b = Collections.unmodifiableList(arrayList);
    }
}
