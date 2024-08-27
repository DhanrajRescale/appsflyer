package nl;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28878a;

    public /* synthetic */ l0(int i10) {
        this.f28878a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        boolean isNormalPriorityEventFile;
        boolean lambda$static$1;
        switch (this.f28878a) {
            case 0:
                return Pattern.matches("cpu[0-9]+", name);
            case 1:
                Intrinsics.checkNotNullExpressionValue(name, "name");
                return new Regex(a3.a.m(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3, "^(%s|%s|%s)[0-9]+.json$", "java.lang.String.format(format, *args)")).c(name);
            case 2:
                Intrinsics.checkNotNullExpressionValue(name, "name");
                return new Regex(a3.a.m(new Object[]{"analysis_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).c(name);
            case 3:
                Intrinsics.checkNotNullExpressionValue(name, "name");
                return new Regex(a3.a.m(new Object[]{"anr_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).c(name);
            case 4:
                Intrinsics.checkNotNullExpressionValue(name, "name");
                return new Regex(a3.a.m(new Object[]{"error_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).c(name);
            case 5:
                isNormalPriorityEventFile = CrashlyticsReportPersistence.isNormalPriorityEventFile(file, name);
                return isNormalPriorityEventFile;
            default:
                lambda$static$1 = CrashlyticsReportPersistence.lambda$static$1(file, name);
                return lambda$static$1;
        }
    }
}
