package kotlin.io;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileWalkDirection;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FileWalkDirection {

    /* renamed from: a, reason: collision with root package name */
    public static final FileWalkDirection f23370a;

    /* renamed from: b, reason: collision with root package name */
    public static final FileWalkDirection f23371b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f23372c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kotlin.io.FileWalkDirection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kotlin.io.FileWalkDirection] */
    static {
        ?? r02 = new Enum("TOP_DOWN", 0);
        f23370a = r02;
        ?? r12 = new Enum("BOTTOM_UP", 1);
        f23371b = r12;
        FileWalkDirection[] fileWalkDirectionArr = {r02, r12};
        f23372c = fileWalkDirectionArr;
        f.E(fileWalkDirectionArr);
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f23372c.clone();
    }
}
