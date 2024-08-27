package al;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nl.e0;
import vt.u0;
import xk.g0;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f657a = u0.a(200, 202);

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f658b = u0.a(503, 504, 429);

    /* renamed from: c, reason: collision with root package name */
    public static j f659c;

    /* renamed from: d, reason: collision with root package name */
    public static List f660d;

    /* renamed from: e, reason: collision with root package name */
    public static int f661e;

    public static final void a(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        e0.f28850c.s(g0.f40374e, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        j jVar = new j(datasetID, url, accessKey);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        f659c = jVar;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        f660d = arrayList;
    }

    public static List b() {
        List list = f660d;
        if (list != null) {
            return list;
        }
        Intrinsics.k("transformedEvents");
        throw null;
    }
}
