package al;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f654a;

    /* renamed from: b, reason: collision with root package name */
    public final String f655b;

    /* renamed from: c, reason: collision with root package name */
    public final String f656c;

    public j(String datasetID, String cloudBridgeURL, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        this.f654a = datasetID;
        this.f655b = cloudBridgeURL;
        this.f656c = accessKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.a(this.f654a, jVar.f654a) && Intrinsics.a(this.f655b, jVar.f655b) && Intrinsics.a(this.f656c, jVar.f656c);
    }

    public final int hashCode() {
        return this.f656c.hashCode() + jr.h.g(this.f655b, this.f654a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb2.append(this.f654a);
        sb2.append(", cloudBridgeURL=");
        sb2.append(this.f655b);
        sb2.append(", accessKey=");
        return nn.d.n(sb2, this.f656c, ')');
    }
}
