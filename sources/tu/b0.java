package tu;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes2.dex */
public final class b0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu.z f36410a;

    public b0(iu.z zVar) {
        this.f36410a = zVar;
    }

    @Override // tu.g
    public final Object a(Object obj, yt.a aVar) {
        this.f36410a.f20560a = obj;
        throw new AbortFlowException(this);
    }
}
