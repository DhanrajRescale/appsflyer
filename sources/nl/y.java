package nl;

import java.util.EnumSet;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28967b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f28968c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28969d;

    /* renamed from: e, reason: collision with root package name */
    public final p f28970e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28971f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28972g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONArray f28973h;

    /* renamed from: i, reason: collision with root package name */
    public final String f28974i;

    /* renamed from: j, reason: collision with root package name */
    public final String f28975j;

    /* renamed from: k, reason: collision with root package name */
    public final String f28976k;

    /* renamed from: l, reason: collision with root package name */
    public final String f28977l;

    /* renamed from: m, reason: collision with root package name */
    public final JSONArray f28978m;

    /* renamed from: n, reason: collision with root package name */
    public final JSONArray f28979n;

    public y(boolean z10, String nuxContent, int i10, EnumSet smartLoginOptions, HashMap dialogConfigurations, boolean z11, p errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z12, boolean z13, JSONArray jSONArray, String sdkUpdateMessage, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.f28966a = z10;
        this.f28967b = i10;
        this.f28968c = smartLoginOptions;
        this.f28969d = z11;
        this.f28970e = errorClassification;
        this.f28971f = z12;
        this.f28972g = z13;
        this.f28973h = jSONArray;
        this.f28974i = sdkUpdateMessage;
        this.f28975j = str;
        this.f28976k = str2;
        this.f28977l = str3;
        this.f28978m = jSONArray2;
        this.f28979n = jSONArray3;
    }
}
