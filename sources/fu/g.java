package fu;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lfu/g;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "fu/a", "fu/e", "fu/f", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class g implements Sequence<File> {

    /* renamed from: a, reason: collision with root package name */
    public final File f16259a;

    /* renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f16260b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f16261c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f16262d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f16263e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16264f;

    public g(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i11 & 2) != 0 ? FileWalkDirection.f23370a : fileWalkDirection;
        i10 = (i11 & 32) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10;
        this.f16259a = file;
        this.f16260b = fileWalkDirection;
        this.f16261c = function1;
        this.f16262d = function12;
        this.f16263e = function2;
        this.f16264f = i10;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new e(this);
    }
}
