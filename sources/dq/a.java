package dq;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14465a;

    public /* synthetic */ a(int i10) {
        this.f14465a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        switch (this.f14465a) {
            case 0:
                return CrashlyticsReportPersistence.a(file, file2);
            default:
                return CrashlyticsReportPersistence.c(file, file2);
        }
    }
}
