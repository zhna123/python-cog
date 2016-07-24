#!/Library/Frameworks/Python.framework/Versions/3.5/bin/python3.5
""" Cog code generation tool.
    http://nedbatchelder.com/code/cog

    Copyright 2004-2015, Ned Batchelder.
"""

import time
start = time.clock()

import sys
from cogapp import Cog

ret = Cog().main(sys.argv)

#print "Time: %.2f sec" % (time.clock() - start)
sys.exit(ret)
