package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CrashlyticsReportJsonTransform.ObjectParser {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11676a;

    public /* synthetic */ a(int i10) {
        this.f11676a = i10;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        switch (this.f11676a) {
            case 0:
                return CrashlyticsReportJsonTransform.c(jsonReader);
            case 1:
                return CrashlyticsReportJsonTransform.a(jsonReader);
            case 2:
                return CrashlyticsReportJsonTransform.d(jsonReader);
            case 3:
                return CrashlyticsReportJsonTransform.f(jsonReader);
            case 4:
                return CrashlyticsReportJsonTransform.e(jsonReader);
            case 5:
                return CrashlyticsReportJsonTransform.c(jsonReader);
            case 6:
                return CrashlyticsReportJsonTransform.g(jsonReader);
            case 7:
                return CrashlyticsReportJsonTransform.g(jsonReader);
            default:
                return CrashlyticsReportJsonTransform.b(jsonReader);
        }
    }
}
