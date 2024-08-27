package bv;

import com.airbnb.deeplinkdispatch.base.MatchIndex;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class x extends q {
    /* JADX WARN: Type inference failed for: r0v3, types: [bv.n0, java.lang.Object] */
    @Override // bv.q
    public final i0 a(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File e10 = file.e();
        Logger logger = z.f7404a;
        Intrinsics.checkNotNullParameter(e10, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(e10, true);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new d(fileOutputStream, (n0) new Object());
    }

    @Override // bv.q
    public void b(b0 source, b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.e().renameTo(target.e())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // bv.q
    public final void c(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (!dir.e().mkdir()) {
            p i10 = i(dir);
            if (i10 != null && i10.f7382b) {
                return;
            }
            throw new IOException("failed to create directory: " + dir);
        }
    }

    @Override // bv.q
    public final void d(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!Thread.interrupted()) {
            File e10 = path.e();
            if (!e10.delete() && e10.exists()) {
                throw new IOException("failed to delete " + path);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // bv.q
    public final List g(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File e10 = dir.e();
        String[] list = e10.list();
        if (list == null) {
            if (!e10.exists()) {
                throw new FileNotFoundException("no such file: " + dir);
            }
            throw new IOException("failed to list " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.c(str);
            arrayList.add(dir.d(str));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // bv.q
    public p i(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File e10 = path.e();
        boolean isFile = e10.isFile();
        boolean isDirectory = e10.isDirectory();
        long lastModified = e10.lastModified();
        long length = e10.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !e10.exists()) {
            return null;
        }
        return new p(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // bv.q
    public final w j(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new w(new RandomAccessFile(file.e(), MatchIndex.ROOT_VALUE));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bv.n0, java.lang.Object] */
    @Override // bv.q
    public final i0 k(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File e10 = file.e();
        Logger logger = z.f7404a;
        Intrinsics.checkNotNullParameter(e10, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(e10, false);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new d(fileOutputStream, (n0) new Object());
    }

    @Override // bv.q
    public final k0 l(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return hl.f.Y0(file.e());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
