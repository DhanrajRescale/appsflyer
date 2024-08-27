package fu;

import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f16246b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f16247c;

    /* renamed from: d, reason: collision with root package name */
    public int f16248d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f16250f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f16250f = eVar;
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
    }

    @Override // fu.f
    public final File a() {
        boolean z10 = this.f16249e;
        e eVar = this.f16250f;
        File file = this.f16258a;
        if (!z10 && this.f16247c == null) {
            Function1 function1 = eVar.f16257d.f16261c;
            if (function1 != null && !((Boolean) function1.invoke(file)).booleanValue()) {
                return null;
            }
            File[] listFiles = file.listFiles();
            this.f16247c = listFiles;
            if (listFiles == null) {
                Function2 function2 = eVar.f16257d.f16263e;
                if (function2 != null) {
                    function2.invoke(file, new AccessDeniedException(this.f16258a, null, "Cannot list files in a directory", 2, null));
                }
                this.f16249e = true;
            }
        }
        File[] fileArr = this.f16247c;
        if (fileArr != null) {
            int i10 = this.f16248d;
            Intrinsics.c(fileArr);
            if (i10 < fileArr.length) {
                File[] fileArr2 = this.f16247c;
                Intrinsics.c(fileArr2);
                int i11 = this.f16248d;
                this.f16248d = i11 + 1;
                return fileArr2[i11];
            }
        }
        if (!this.f16246b) {
            this.f16246b = true;
            return file;
        }
        Function1 function12 = eVar.f16257d.f16262d;
        if (function12 != null) {
            function12.invoke(file);
        }
        return null;
    }
}
